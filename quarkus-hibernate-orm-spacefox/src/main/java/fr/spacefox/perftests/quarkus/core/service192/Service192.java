package fr.spacefox.perftests.quarkus.core.service192;

import fr.spacefox.perftests.quarkus.core.port.data.Entity192DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service192.model.Model192;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service192 {

    private final Entity192DatasourcePort datasource;

    public Service192(Entity192DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model192 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
