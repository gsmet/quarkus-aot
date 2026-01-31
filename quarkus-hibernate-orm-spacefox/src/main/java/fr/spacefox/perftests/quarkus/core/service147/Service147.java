package fr.spacefox.perftests.quarkus.core.service147;

import fr.spacefox.perftests.quarkus.core.port.data.Entity147DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service147.model.Model147;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service147 {

    private final Entity147DatasourcePort datasource;

    public Service147(Entity147DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model147 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
