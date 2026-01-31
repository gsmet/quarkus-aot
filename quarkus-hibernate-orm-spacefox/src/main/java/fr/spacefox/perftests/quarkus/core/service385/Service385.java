package fr.spacefox.perftests.quarkus.core.service385;

import fr.spacefox.perftests.quarkus.core.port.data.Entity385DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service385.model.Model385;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service385 {

    private final Entity385DatasourcePort datasource;

    public Service385(Entity385DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model385 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
