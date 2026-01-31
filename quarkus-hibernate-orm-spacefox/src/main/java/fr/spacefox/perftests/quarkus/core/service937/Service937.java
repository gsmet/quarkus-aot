package fr.spacefox.perftests.quarkus.core.service937;

import fr.spacefox.perftests.quarkus.core.port.data.Entity937DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service937.model.Model937;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service937 {

    private final Entity937DatasourcePort datasource;

    public Service937(Entity937DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model937 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
