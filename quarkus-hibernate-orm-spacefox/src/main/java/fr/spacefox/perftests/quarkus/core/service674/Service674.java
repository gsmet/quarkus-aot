package fr.spacefox.perftests.quarkus.core.service674;

import fr.spacefox.perftests.quarkus.core.port.data.Entity674DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service674.model.Model674;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service674 {

    private final Entity674DatasourcePort datasource;

    public Service674(Entity674DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model674 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
