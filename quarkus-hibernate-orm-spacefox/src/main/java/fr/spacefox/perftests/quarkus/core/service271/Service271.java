package fr.spacefox.perftests.quarkus.core.service271;

import fr.spacefox.perftests.quarkus.core.port.data.Entity271DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service271.model.Model271;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service271 {

    private final Entity271DatasourcePort datasource;

    public Service271(Entity271DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model271 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
