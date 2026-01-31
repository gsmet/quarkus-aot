package fr.spacefox.perftests.quarkus.core.service468;

import fr.spacefox.perftests.quarkus.core.port.data.Entity468DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service468.model.Model468;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service468 {

    private final Entity468DatasourcePort datasource;

    public Service468(Entity468DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model468 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
