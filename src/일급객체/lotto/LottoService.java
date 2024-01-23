package 일급객체.lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoService {
    private static final int LOTTO_SIZE = 6;

    public void createLotto() {
//        List<Long> lottoNumbers = createNonDuplicateNumbers();
//        validateSize(lottoNumbers);
//        validateDuplicate(lottoNumbers);
    }

    private void validateSize(List<Long> lottoNumbers) {
        if (lottoNumbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException("로또 번호는 6개만 가능합니다.");  // 예외 처리 필요. 예외 처리 안하면 무한 루프 돌아감. 예외 처리 필요함. 예외 처리 안하면 무한 루프 돌아감. 예외 처리 필요함. 예외 처리 안하면 무한 루프 돌아감. 예외 처리 필�
        }
    }

    private void validateDuplicate(List<Long> lottoNumbers) {
        Set<Long> nonDuplicateNumbers = new HashSet<>(lottoNumbers);

        if (nonDuplicateNumbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException("로또 번호는 중복되지 않아야 합니다.");
        }
    }
}
