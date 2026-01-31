package fr.spacefox.perftests.quarkus.core.service706;

import fr.spacefox.perftests.quarkus.core.port.data.Entity706DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service706.model.Model706;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service706 {

    private final Entity706DatasourcePort datasource;

    public Service706(Entity706DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model706 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
