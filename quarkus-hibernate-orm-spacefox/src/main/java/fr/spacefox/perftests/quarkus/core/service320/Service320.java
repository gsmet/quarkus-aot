package fr.spacefox.perftests.quarkus.core.service320;

import fr.spacefox.perftests.quarkus.core.port.data.Entity320DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service320.model.Model320;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service320 {

    private final Entity320DatasourcePort datasource;

    public Service320(Entity320DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model320 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
