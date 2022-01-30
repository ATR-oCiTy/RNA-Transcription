class RnaTranscription {
    String a="";
    String transcribe(String dnaStrand) {
        for(int i=0; i<dnaStrand.length(); i++){
            switch(dnaStrand.charAt(i)) {
                case 'G':
                    a += "C";
                    break;
                case 'C':
                    a += "G";
                    break;
                case 'T':
                    a += "A";
                    break;
                case 'A':
                    a += "U";
                    break;
                default:
                    a += "";
            }
        }
        return a;
    }

}
