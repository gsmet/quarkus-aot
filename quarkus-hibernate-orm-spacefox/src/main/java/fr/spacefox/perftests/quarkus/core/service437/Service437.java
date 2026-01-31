package fr.spacefox.perftests.quarkus.core.service437;

import fr.spacefox.perftests.quarkus.core.port.data.Entity437DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service437.model.Model437;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service437 {

    private final Entity437DatasourcePort datasource;

    public Service437(Entity437DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model437 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
