package fr.spacefox.perftests.quarkus.core.service222;

import fr.spacefox.perftests.quarkus.core.port.data.Entity222DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service222.model.Model222;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service222 {

    private final Entity222DatasourcePort datasource;

    public Service222(Entity222DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model222 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
