package fr.spacefox.perftests.quarkus.core.service481;

import fr.spacefox.perftests.quarkus.core.port.data.Entity481DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service481.model.Model481;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service481 {

    private final Entity481DatasourcePort datasource;

    public Service481(Entity481DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model481 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
