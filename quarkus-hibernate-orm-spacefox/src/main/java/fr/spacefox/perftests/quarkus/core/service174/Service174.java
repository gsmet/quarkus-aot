package fr.spacefox.perftests.quarkus.core.service174;

import fr.spacefox.perftests.quarkus.core.port.data.Entity174DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service174.model.Model174;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service174 {

    private final Entity174DatasourcePort datasource;

    public Service174(Entity174DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model174 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
