public void transfer(Connection conn, int fromAcc, int toAcc, double amount) throws SQLException {
    conn.setAutoCommit(false);
    try {
        PreparedStatement ps1 = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
        ps1.setDouble(1, amount);
        ps1.setInt(2, fromAcc);
        ps1.executeUpdate();

        PreparedStatement ps2 = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
        ps2.setDouble(1, amount);
        ps2.setInt(2, toAcc);
        ps2.executeUpdate();

        conn.commit();
    } catch (Exception e) {
        conn.rollback();
        e.printStackTrace();
    }
}


## Output
  Transferring $100 from Account 1 to Account 2...  
  Transaction Successful!
