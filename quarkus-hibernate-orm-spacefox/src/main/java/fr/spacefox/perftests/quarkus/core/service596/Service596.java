package fr.spacefox.perftests.quarkus.core.service596;

import fr.spacefox.perftests.quarkus.core.port.data.Entity596DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service596.model.Model596;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service596 {

    private final Entity596DatasourcePort datasource;

    public Service596(Entity596DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model596 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
