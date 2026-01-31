package fr.spacefox.perftests.quarkus.core.service705;

import fr.spacefox.perftests.quarkus.core.port.data.Entity705DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service705.model.Model705;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service705 {

    private final Entity705DatasourcePort datasource;

    public Service705(Entity705DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model705 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
