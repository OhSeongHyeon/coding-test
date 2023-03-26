function solution(array, commands) {
    const answer = [];
    for(let i = 0; i < commands.length; i++) {
        const command = commands[i];
        const start = command[0];
        const end = command[1];
        const afterSortIndex = command[2];
        const afterSortArr = new Array();
        
        for(let j = start-1; j < end; j++){
            afterSortArr.push(array[j]);
        }
        
        for(let k = 0; k < afterSortArr.length; k++){
            for(let l = k+1; l < afterSortArr.length; l++){
                if(afterSortArr[k] > afterSortArr[l]){
                    let temp = afterSortArr[k];
                    afterSortArr[k] = afterSortArr[l];
                    afterSortArr[l] = temp;
                }
            }
        }
        
        answer.push(afterSortArr[afterSortIndex-1])
    }
    return answer;
}