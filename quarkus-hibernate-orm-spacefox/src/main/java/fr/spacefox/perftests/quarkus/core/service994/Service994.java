package fr.spacefox.perftests.quarkus.core.service994;

import fr.spacefox.perftests.quarkus.core.port.data.Entity994DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service994.model.Model994;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service994 {

    private final Entity994DatasourcePort datasource;

    public Service994(Entity994DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model994 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
