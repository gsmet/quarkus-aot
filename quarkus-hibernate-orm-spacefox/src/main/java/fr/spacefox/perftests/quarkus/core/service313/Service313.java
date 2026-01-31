package fr.spacefox.perftests.quarkus.core.service313;

import fr.spacefox.perftests.quarkus.core.port.data.Entity313DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service313.model.Model313;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service313 {

    private final Entity313DatasourcePort datasource;

    public Service313(Entity313DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model313 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
