package fr.spacefox.perftests.quarkus.core.service912;

import fr.spacefox.perftests.quarkus.core.port.data.Entity912DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service912.model.Model912;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service912 {

    private final Entity912DatasourcePort datasource;

    public Service912(Entity912DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model912 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
