BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inp = br.readLine().split(", ");
        int ins[] = new int[inp.length];
        int min = 0;
        
        for(int i=0; i<inp.length; i++){
            ins[i] = Integer.parseInt(inp[i]);
        }
        
        Arrays.sort(ins);
        min = ins[0];
        
        for(int i=0; i<ins.length; i++){
            if(ins[i] == min){
                min++;
            }else{
                break;
            }
        }
        System.out.println(min);
