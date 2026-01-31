package fr.spacefox.perftests.quarkus.core.service353;

import fr.spacefox.perftests.quarkus.core.port.data.Entity353DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service353.model.Model353;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service353 {

    private final Entity353DatasourcePort datasource;

    public Service353(Entity353DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model353 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
