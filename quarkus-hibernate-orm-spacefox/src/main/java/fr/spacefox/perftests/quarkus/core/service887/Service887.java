package fr.spacefox.perftests.quarkus.core.service887;

import fr.spacefox.perftests.quarkus.core.port.data.Entity887DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service887.model.Model887;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service887 {

    private final Entity887DatasourcePort datasource;

    public Service887(Entity887DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model887 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
