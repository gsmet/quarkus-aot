package fr.spacefox.perftests.quarkus.core.service308;

import fr.spacefox.perftests.quarkus.core.port.data.Entity308DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service308.model.Model308;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service308 {

    private final Entity308DatasourcePort datasource;

    public Service308(Entity308DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model308 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
