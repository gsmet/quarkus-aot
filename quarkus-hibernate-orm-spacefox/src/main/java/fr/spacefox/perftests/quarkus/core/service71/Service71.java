package fr.spacefox.perftests.quarkus.core.service71;

import fr.spacefox.perftests.quarkus.core.port.data.Entity71DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service71.model.Model71;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service71 {

    private final Entity71DatasourcePort datasource;

    public Service71(Entity71DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model71 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
