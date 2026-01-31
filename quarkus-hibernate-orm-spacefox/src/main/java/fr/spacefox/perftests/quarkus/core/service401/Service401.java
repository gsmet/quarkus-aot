package fr.spacefox.perftests.quarkus.core.service401;

import fr.spacefox.perftests.quarkus.core.port.data.Entity401DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service401.model.Model401;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service401 {

    private final Entity401DatasourcePort datasource;

    public Service401(Entity401DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model401 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
