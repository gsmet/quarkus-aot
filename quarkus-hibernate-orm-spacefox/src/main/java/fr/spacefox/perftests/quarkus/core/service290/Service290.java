package fr.spacefox.perftests.quarkus.core.service290;

import fr.spacefox.perftests.quarkus.core.port.data.Entity290DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service290.model.Model290;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service290 {

    private final Entity290DatasourcePort datasource;

    public Service290(Entity290DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model290 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
