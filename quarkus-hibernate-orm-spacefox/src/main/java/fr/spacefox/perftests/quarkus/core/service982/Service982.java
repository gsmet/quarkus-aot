package fr.spacefox.perftests.quarkus.core.service982;

import fr.spacefox.perftests.quarkus.core.port.data.Entity982DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service982.model.Model982;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service982 {

    private final Entity982DatasourcePort datasource;

    public Service982(Entity982DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model982 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
