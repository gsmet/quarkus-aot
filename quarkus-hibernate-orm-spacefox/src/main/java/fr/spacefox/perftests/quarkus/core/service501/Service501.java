package fr.spacefox.perftests.quarkus.core.service501;

import fr.spacefox.perftests.quarkus.core.port.data.Entity501DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service501.model.Model501;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service501 {

    private final Entity501DatasourcePort datasource;

    public Service501(Entity501DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model501 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
