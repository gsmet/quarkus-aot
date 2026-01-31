package fr.spacefox.perftests.quarkus.core.service717;

import fr.spacefox.perftests.quarkus.core.port.data.Entity717DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service717.model.Model717;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service717 {

    private final Entity717DatasourcePort datasource;

    public Service717(Entity717DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model717 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
