package fr.spacefox.perftests.quarkus.core.service947;

import fr.spacefox.perftests.quarkus.core.port.data.Entity947DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service947.model.Model947;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service947 {

    private final Entity947DatasourcePort datasource;

    public Service947(Entity947DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model947 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
