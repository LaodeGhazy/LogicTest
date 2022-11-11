Scanner sc = new Scanner(System.in);
        int n;
        
        n = sc.nextInt();
        
        if(n%2 != 0){
            for(int i=0; i<n; i++){
                if(i == 0 || i == n-1){
                    for(int j=0; j<n; j++){
                        System.out.print("X");
                    }
                }else{
                    for(int j=0; j<n; j++){
                        if(j == 0 || j == n-1){
                            System.out.print("X");
                        }else{
                            if(j == n-i-1){
                                System.out.print("X");
                            }else{
                                System.out.print("O");
                            }
                        }
                    }
                }
                System.out.println("");
            }
            
        }else{
            System.out.println("Harus bilangan ganjil");
        }
