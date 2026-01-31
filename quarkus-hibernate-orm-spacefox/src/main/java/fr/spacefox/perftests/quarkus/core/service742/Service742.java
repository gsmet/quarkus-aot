package fr.spacefox.perftests.quarkus.core.service742;

import fr.spacefox.perftests.quarkus.core.port.data.Entity742DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service742.model.Model742;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service742 {

    private final Entity742DatasourcePort datasource;

    public Service742(Entity742DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model742 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
