package fr.spacefox.perftests.quarkus.core.service344;

import fr.spacefox.perftests.quarkus.core.port.data.Entity344DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service344.model.Model344;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service344 {

    private final Entity344DatasourcePort datasource;

    public Service344(Entity344DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model344 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
