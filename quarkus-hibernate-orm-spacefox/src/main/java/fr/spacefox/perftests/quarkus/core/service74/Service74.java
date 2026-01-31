package fr.spacefox.perftests.quarkus.core.service74;

import fr.spacefox.perftests.quarkus.core.port.data.Entity74DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service74.model.Model74;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service74 {

    private final Entity74DatasourcePort datasource;

    public Service74(Entity74DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model74 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
