package fr.spacefox.perftests.quarkus.core.service111;

import fr.spacefox.perftests.quarkus.core.port.data.Entity111DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service111.model.Model111;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service111 {

    private final Entity111DatasourcePort datasource;

    public Service111(Entity111DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model111 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
