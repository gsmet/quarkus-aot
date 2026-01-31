package fr.spacefox.perftests.quarkus.core.service883;

import fr.spacefox.perftests.quarkus.core.port.data.Entity883DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service883.model.Model883;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service883 {

    private final Entity883DatasourcePort datasource;

    public Service883(Entity883DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model883 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
