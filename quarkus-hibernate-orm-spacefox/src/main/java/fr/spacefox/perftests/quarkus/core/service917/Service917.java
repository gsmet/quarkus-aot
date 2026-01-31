package fr.spacefox.perftests.quarkus.core.service917;

import fr.spacefox.perftests.quarkus.core.port.data.Entity917DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service917.model.Model917;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service917 {

    private final Entity917DatasourcePort datasource;

    public Service917(Entity917DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model917 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
