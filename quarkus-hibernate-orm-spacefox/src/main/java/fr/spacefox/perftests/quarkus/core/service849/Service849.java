package fr.spacefox.perftests.quarkus.core.service849;

import fr.spacefox.perftests.quarkus.core.port.data.Entity849DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service849.model.Model849;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service849 {

    private final Entity849DatasourcePort datasource;

    public Service849(Entity849DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model849 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
