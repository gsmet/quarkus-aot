package fr.spacefox.perftests.quarkus.core.service418;

import fr.spacefox.perftests.quarkus.core.port.data.Entity418DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service418.model.Model418;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service418 {

    private final Entity418DatasourcePort datasource;

    public Service418(Entity418DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model418 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
