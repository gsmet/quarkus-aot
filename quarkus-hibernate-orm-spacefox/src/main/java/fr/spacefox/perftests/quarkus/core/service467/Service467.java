package fr.spacefox.perftests.quarkus.core.service467;

import fr.spacefox.perftests.quarkus.core.port.data.Entity467DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service467.model.Model467;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service467 {

    private final Entity467DatasourcePort datasource;

    public Service467(Entity467DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model467 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
