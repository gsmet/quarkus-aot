package fr.spacefox.perftests.quarkus.core.service672;

import fr.spacefox.perftests.quarkus.core.port.data.Entity672DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service672.model.Model672;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service672 {

    private final Entity672DatasourcePort datasource;

    public Service672(Entity672DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model672 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
