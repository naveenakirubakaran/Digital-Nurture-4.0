![image](https://github.com/user-attachments/assets/728d71da-926c-44c0-9613-fafad53e6d5f)# Digital-Nurture-4.0

subgraph Client
    A[Scheduled Jobs]
  end
  subgraph Monitoring Service
    B[Heartbeat API]
    C[(PostgreSQL)]
    D[Checker Service]
    E[Notification Engine]
  end
  subgraph Frontend
    F[React Dashboard]
  end

  A -->|HTTP POST /ping| B
  B --> C
  D --> C
  D --> E
  E -->|SMTP| G[Email]
  F --> C
