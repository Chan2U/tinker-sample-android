package tinker.sample.android.app;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by qq on 16/10/10.
 */

public class SampleApplication extends TinkerApplication {

    public SampleApplication(){
        super(
                ShareConstants.TINKER_ENABLE_ALL,
                "tinker.sample.android.app.SampleApplicationLike"
        );
    }
}
