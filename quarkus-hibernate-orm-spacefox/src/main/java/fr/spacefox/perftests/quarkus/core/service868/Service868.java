package fr.spacefox.perftests.quarkus.core.service868;

import fr.spacefox.perftests.quarkus.core.port.data.Entity868DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service868.model.Model868;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service868 {

    private final Entity868DatasourcePort datasource;

    public Service868(Entity868DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model868 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
