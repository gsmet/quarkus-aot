package fr.spacefox.perftests.quarkus.core.service447;

import fr.spacefox.perftests.quarkus.core.port.data.Entity447DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service447.model.Model447;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service447 {

    private final Entity447DatasourcePort datasource;

    public Service447(Entity447DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model447 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
