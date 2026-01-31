package fr.spacefox.perftests.quarkus.core.service121;

import fr.spacefox.perftests.quarkus.core.port.data.Entity121DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service121.model.Model121;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service121 {

    private final Entity121DatasourcePort datasource;

    public Service121(Entity121DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model121 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
