package fr.spacefox.perftests.quarkus.core.service315;

import fr.spacefox.perftests.quarkus.core.port.data.Entity315DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service315.model.Model315;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service315 {

    private final Entity315DatasourcePort datasource;

    public Service315(Entity315DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model315 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
