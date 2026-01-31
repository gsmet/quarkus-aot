package fr.spacefox.perftests.quarkus.core.service699;

import fr.spacefox.perftests.quarkus.core.port.data.Entity699DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service699.model.Model699;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service699 {

    private final Entity699DatasourcePort datasource;

    public Service699(Entity699DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model699 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
