package fr.spacefox.perftests.quarkus.core.service821;

import fr.spacefox.perftests.quarkus.core.port.data.Entity821DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service821.model.Model821;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service821 {

    private final Entity821DatasourcePort datasource;

    public Service821(Entity821DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model821 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
