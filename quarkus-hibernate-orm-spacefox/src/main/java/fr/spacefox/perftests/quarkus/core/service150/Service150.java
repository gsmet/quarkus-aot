package fr.spacefox.perftests.quarkus.core.service150;

import fr.spacefox.perftests.quarkus.core.port.data.Entity150DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service150.model.Model150;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service150 {

    private final Entity150DatasourcePort datasource;

    public Service150(Entity150DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model150 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
