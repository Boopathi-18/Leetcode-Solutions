
        while (n >= turn) {
            n -= turn;
            turn++;
        }

        if (turn % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }

        sc.close();
    }
}