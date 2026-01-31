package fr.spacefox.perftests.quarkus.core.service747;

import fr.spacefox.perftests.quarkus.core.port.data.Entity747DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service747.model.Model747;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service747 {

    private final Entity747DatasourcePort datasource;

    public Service747(Entity747DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model747 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
